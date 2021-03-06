package org.webstories.core.story.editor;

import org.webstories.core.story.StoryMeta;
import org.webstories.core.text.PlainText;
import org.webstories.core.validation.Validatable;
import org.webstories.web.util.params.RequestParams;

public class EditorStoryDetailsInput implements Validatable, StoryMeta {
	private PlainText title;
	private PlainText summary;
	private PlainText synopsis;
	public static EditorStoryDetailsInput from( RequestParams params ) {
		EditorStoryDetailsInput meta = new EditorStoryDetailsInput(  );
		meta.title = PlainText.from( params.get( "title" ).toString() );
		meta.summary = PlainText.from( params.get( "summary" ).toString() );
		meta.synopsis = PlainText.from( params.get( "synopsis" ).toString() );
		return meta;
	}
	@Override
	public boolean validate() {
		if ( title.isEmpty() ) {
			return false;
		}
		if ( summary.isEmpty() ) {
			return false;
		}
		if ( synopsis.isEmpty() ) {
			return false;
		}
		// LF is not allowed for summary
		if ( summary.toString().contains( "\n" ) ) {
			return false;
		}
		return true;
	}
	@Override
	public PlainText getTitle() {
		return title;
	}
	@Override
	public PlainText getSummary() {
		return summary;
	}
	@Override
	public PlainText getSynopsis() {
		return synopsis;
	}
}
