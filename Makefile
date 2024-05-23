# Makefile for the tk_pay project

# Variables
JAVAC = javac
JAVA = java
SRC_DIR = .
BIN_DIR = bin

# Find all .java files
SOURCES = $(shell find $(SRC_DIR) -name '*.java')
# Generate .class file names from .java file names
CLASSES = $(SOURCES:$(SRC_DIR)/%.java=$(BIN_DIR)/%.class)

# Targets
all: $(CLASSES)

run: all
	$(JAVA) -cp $(BIN_DIR) Main

clean:
	rm -rf $(BIN_DIR)

# Compile .java files
$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	mkdir -p $(dir $@)
	$(JAVAC) -d $(BIN_DIR) $(SOURCES)
