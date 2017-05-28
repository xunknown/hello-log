#!/bin/sh 

mainClass=alpha.study.hellolog.LoggerTest
libs=./libs/*
classpath="."
for file in $libs; do 
	classpath=$classpath":"$file
done
classpath=$classpath:../:$CLASSPATH
java -classpath $classpath $mainClass &

