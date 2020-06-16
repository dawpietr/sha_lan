SHELL := /bin/bash
antlr_path = /usr/local/lib/antlr-4.8-complete.jar
antlr = java -Xmx500M -cp "${antlr_path}:$$CLASSPATH" org.antlr.v4.Tool
grun = java -Xmx500M -cp "${antlr_path}:$$CLASSPATH" org.antlr.v4.gui.TestRig
javac = javac -cp ~/IdeaProjects/sha_lan/lib/antlr-4.8-complete.jar
out_java_path = src/out_java
#out_js_path = src/parser

gui:
	cd ./src && $(antlr) Shadow.g4 -o out_java
	cd ${out_java_path} && $(javac) Shadow*.java
	cd ${out_java_path} && $(grun) Shadow program ../../examples/now.Shadow -gui

node:
	cd ./lib && $(antlr) -Dlanguage=Java -visitor -o . ~/IdeaProjects/sha_lan/Shadow.g4
	java ~/IdeaProjects/sha_lan/src/MainShadow.java ~/IdeaProjects/sha_lan/now.Shadow
	
nodetest: 
	cd src/main/antlr4 && $(antlr) -Dlanguage=Java8 -visitor -o ../../parser Shadow.g4
	node src/main/java/main.java ../examples/nedetest.shadow

tests:
	@cd src/main/antlr4 && $(antlr) -Dlanguage=Java8 -visitor -o ../../parser Shadow.g4
	@cd src/tests && \
	for testfile in ./*_test.js ; \
	do \
 		echo "Executing test $$testfile..." ; \
 		node $$testfile ; \
	done
