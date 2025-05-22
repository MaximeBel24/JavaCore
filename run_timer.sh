#!/bin/bash

JAR_NAME="Timer.jar"

# Aide
if [ "$1" == "-h" ] || [ "$1" == "--help" ]; then
    echo "Usage: ./run_timer.sh <name> <hours> <minutes> <seconds>"
    echo "Example: ./run_timer.sh \"Riz basmati\" 0 5 0"
    exit 0
fi

# Exécution
if [ $# -eq 4 ]; then
  java -jar "$JAR_NAME" "$1" "$2" "$3" "$4"
else
  exit 0
fi