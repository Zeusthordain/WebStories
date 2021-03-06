module.exports = function( grunt ) {
	"use strict";
	return {
		editor: {
			options: {
				urls: [
					"http://localhost:8000/test/webapp/qunit/custom/editor/EditorSavingQueue.html",
					"http://localhost:8000/test/webapp/qunit/custom/editor/KeyEvent.html",
					"http://localhost:8000/test/webapp/qunit/custom/editor/EditorModel.html"
				]
			}
		},
		global: {
			options: {
				urls: [
					"http://localhost:8000/test/webapp/qunit/custom/global/DirectiveUtils.html"
				]
			}
		},
		story: {
			options: {
				urls: [
					"http://localhost:8000/test/webapp/qunit/custom/story/ControlsManip.html",
					"http://localhost:8000/test/webapp/qunit/custom/story/SlidesManip.html"
				]
			}
		}
	};
};
