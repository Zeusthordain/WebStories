QUnit.config.autostart = false;
require( ["jquery", "jquery.ws.editor"], function( $ ) {
	"use strict";
	start();
	var methods = $.ws.editor.prototype;
	
	module( "keys" );
	
	test( "Command keys should not be considered character related keys", function() {
		expect( 3 );
		var ctrlX = methods._keyEvent({
			ctrlKey: true,
			keyCode: 88
		});
		var ctrlC = methods._keyEvent({
			ctrlKey: true,
			keyCode: 67
		});
		var F1 = methods._keyEvent({
			keyCode: 112
		});
		strictEqual( ctrlX.isCharacter(), false, "ctrl + x should not be considered a character" );
		strictEqual( ctrlC.isCharacter(), false, "ctrl + c should not be considered a character" );
		strictEqual( F1.isCharacter(), false, "F1 should not be considered a character" );
	});
	
	test( "Text pasting should be considered a character related key", function() {
		expect( 1 );
		var ctrlV = methods._keyEvent({
			ctrlKey: true,
			keyCode: 86
		});
		strictEqual( ctrlV.isCharacter(), true, "ctrl + v should be considered a character" );
	});
	
	test( "Text manip keys", function() {
		expect( 3 );
		var BACKSPACE = methods._keyEvent({
			keyCode: 8
		});
		var DELETE = methods._keyEvent({
			keyCode: 46
		});
		var ctrlX = methods._keyEvent({
			ctrlKey: true,
			keyCode: 88
		});
		strictEqual( BACKSPACE.isTextManip(), true, "backspace should be considered text manip" );
		strictEqual( DELETE.isTextManip(), true, "delete should be considered text manip" );
		strictEqual( ctrlX.isTextManip(), true, "ctrl + x should be considered text manip" );
	});
});