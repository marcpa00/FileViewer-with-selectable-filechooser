FileViewer-with-selectable-filechooser
======================================

FileViewer sample from griffon distribution adapted to use my selectable-filechooser plugin.

> *Note*: these instructions were written initially targetting un*x machines (linux, mac osx, freebsd).  
> On windows, I would suggest [mysysgit](http://code.google.com/p/msysgit/downloads/list?q=full+installer+official+git).  
> It is not a GUI program, but you will be able to follow the instructions below _à la lettre_ !   

## Step 1 : run original app

* checkout sources :

	    git clone https://github.com/marcpa00/FileViewer-with-selectable-filechooser

* rewind to tag "original" :

	    cd FileViewer-with-selectable-filechooser
	    git checkout original

* install latest griffon (http://griffon.codehaus.org/Download or use gvmtool, http://gvmtool.net)
   + note: on relatively recent un*x machine, I suggest you get gvm with ```curl -s get.gvmtool.net | bash```, follow the instructions then do ```gvm install griffon```
   + note: the plugin and the example have been made against griffon 1.1.0 : if your griffon is more recent, you will be asked to upgrade it; just follow the instructions and it should upgrade without problems.

* run the app :

	    griffon run-app

* open a file, notice how the open file dialog looks like and behave

## Step 2 : install selectable-filechooser plugin from Griffon Artifact Portal

* install the plugin in the sample

       griffon install-plugin selectable-filechooser

* update the sample sources to latest on master branch

		git checkout master

* run the modified application :

	    griffon run-app

* notice the different file choosers used by each selector button
* look at the differences of subdirectory ```griffon-app``` between "original" and "HEAD" of master branch to see what have been modified in the sample sources to use selectable-filechooser.

	    git diff original HEAD griffon-app


## Step 2 (alternate method) : install selectable-filechooser plugin from sources

Alternatively, you can get the plugin's sources and build it locally with griffon.

* checkout sources of plugin in a sibling folder

	    cd ..
	    git clone https://github.com/marcpa00/selectable-filechooser
	    cd selectable-filechooser

* create the zip of plugin (it may ask you to upgrade if your griffon is newer than 1.1.0, do it with ```griffon upgrade```):

	    griffon package-plugin

* install the plugin in the sample

	    cd ../FileViewer-with-selectable-filechooser
	    griffon install-plugin ../selectable-filechooser/target/package/griffon-selectable-filechooser-0.1.zip

* update the sample sources to latest on master branch

		git checkout master

* run the modified application :

	    griffon run-app

* notice the different file choosers used by each selector button
* look at the differences of subdirectory ```griffon-app``` between "original" and "HEAD" of master branch to see what have been modified in the sample sources to use selectable-filechooser.

	    git diff original HEAD griffon-app

Enjoy !


Marc Paquette

