module.exports = function( grunt ) {
	"use strict";
	return {
		wildfly: {
			options: {
				preset: "wildfly-8.1.0.Final"
			},
			files: [{
				expand: true,
				cwd: "src",
				src: [ "test/webapp/**/*" ]
			}, {
				expand: true,
				cwd: "src",
				src: [ "main/webapp/static/js/**/*" ]
			}, {
				expand: true,
				cwd: "src/main/webapp/",
				src: [ "WEB-INF/tags/**/*" ]
			}]
		}
	};
};
