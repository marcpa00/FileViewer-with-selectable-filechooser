/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Danno Ferrin
 */

import ca.marcpa.SelectableFileChooser

openAction = action(closure: controller.openFile, name:"Open")

fileViewerFrame = application(title:'File Viewer',
  size:[500,300],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {
    borderLayout()
	hbox(constraints:NORTH) {
        textField(columns:20, action:openAction,
            text: bind('fileName', target:model, id:'textBinding'))
        vbox() {
            button("browse...(default)", actionPerformed: controller.browseWithDefault)
            button("browse...(native)",  actionPerformed: controller.browseWithNative)
            button("browse...(pure-java)",   actionPerformed: controller.browseWithPure)
        }
        button(openAction)
    }
    filesPane = tabbedPane(constraints:CENTER)
}

// NOTE: native SelectableFileChooser must be created after the application node
defaultFileChooser = new ca.marcpa.SelectableFileChooser()
nativeFileChooser = new ca.marcpa.SelectableFileChooser(useNativeDialog: true)
pureJavaFileChooser = new ca.marcpa.SelectableFileChooser(useNativeDialog: false)

