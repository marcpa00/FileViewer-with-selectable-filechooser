FileViewer-with-selectable-filechooser
======================================

FileViewer sample from griffon distribution adapted to use my selectable-filechooser plugin.

## Step 1 : run original app

* checkout sources :

    git clone https://github.com/marcpa00/FileViewer-with-selectable-filechooser

* rewind to tag "original" :

    cd FileViewer-with-selectable-filechooser
    git checkout original

* install latest griffon (http://griffon.codehaus.org/Download or use gvmtool, http://gvmtool.net)
+ note: on relatively recent un*x machine, I suggest you get gvm with 'curl -s get.gvmtool.net | bash', follow the instructions then do 'gvm install griffon'
+ note: the plugin and the example have been made against griffon 1.1.0 : if your griffon is more recent, you will be asked to upgrade it; just follow the instructions and it should upgrade without problems.

* run the app :

    griffon run-app

* open a file, notice how the open file dialog looks like and behave

## Step 2 : install selectable-filechooser plugin (until the plugin finds its way to central repository, you will
         have to build the plugin from the sources)

* checkout sources of plugin in a sibling folder

    cd ..
    git clone https://github.com/marcpa00/selectable-filechooser
    cd selectable-filechooser

* create the zip of plugin (it may ask you to upgrade if your griffon is newer than 1.1.0, do it with 'griffon upgrade'):

    griffon package-plugin

* install the plugin in the sample

    cd ../FileViewer-with-selectable-filechooser
    griffon install-plugin ../selectable-filechooser/target/package/griffon-selectable-filechooser-0.1.zip

* update the sample sources to latest on master branch

    git checkout master

* run the modified application :

    griffon run-app

* notice the different file choosers used by each selector button
* look at the differences between 'original' and HEAD of master branch to see how to use selectable-filechooser.

    git diff original HEAD

Enjoy !

Marc Paquette
