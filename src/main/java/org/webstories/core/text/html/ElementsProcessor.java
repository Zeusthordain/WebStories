package org.webstories.core.text.html;

import org.webstories.core.text.manipulable.BaseProcessor;
import org.webstories.core.text.manipulable.ProcessorAlias;

public class ElementsProcessor {
	public static class Converter extends BaseProcessor {
		public Converter() {
			super( ProcessorAlias.HTML_ELEMENTS );
		}
		@Override
		public String process( HTMLOutput message ) {
			String result = message.getCurrent();
			
			// Replace LF
			result = result
				.replace( "\r", "" )
				.replaceAll( "(?<!\n)\n(?!\n)", "<br>" );
			
			// Replace intended paragraphs
			String wrappedText = "";
			String[] paragraphs = result.split( "\n\n" );
			for ( int i = 0; i < paragraphs.length; i++ ) {
				String paragraph = paragraphs[ i ];
				if ( !"".equals( paragraph ) ) {
					wrappedText += "<p>" + paragraph + "</p>";
				}
			}
			result = wrappedText;
			
			return result;
		}
	}
}
