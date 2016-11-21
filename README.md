# Configy
Configy is a command-line application that provides a unified configuration
file management interface. It allows you to automatically configure many
programs by providing (and allowing user-creation of) bookmarks for
quickly modifying configuration.

## Examples

**Change your ZSH configuration to one on dotshare.it**  
    `configy zsh remote http://dotshare.it/dots/1184/0/raw/`

**Change your .bashrc configuration to a local file**

`configy bash "$HOME/myfile"`

# Architecture
Configy is currently under construction. So, this README is actually going to serve as a 
blueprint as much as it's meant to be informational. 

## Interfaces
**WritableAction**  
Contains one function: `public void write(WritableType, String (filename))`

## Classes
### Abstract
**Writable**  
Contains a reference to a Target, the WritableType enum, and a configuration
singleton object. It extends Write based on the configuration. The main
method, `write`, can throw an exception.

**Target**  
Target is a file that can be written to or read from. Target is meant to
facilitate writing to the file, but abstracts over remote files, writing
to local ones.

### Concrete
**Command**  
Extends Writable. It contains all the information required to write information
to a Target, and is the base model of the program.

**Remote**  
A reference to a remote target. The file is copied into the local file.

**Local**  
A reference to a file located on the user's computer. It's modified according
to the Configuration.

**Configuration**  
A map of information read from the program's TOML configuration file.

## Enumerated Types
**WritableType**  
The WritableType contains a few options for how to write to the file. It
can append or replace an existing file on the filesystem.
