# MofGen
A language for specifying and generating EMF-compliant models from corresponding (ecore-)metamodels

## Requirements
* Java SE 8 or higher
* Eclipse Modeling Tools
* Working [eMoflon](https://github.com/eMoflon/emoflon-ibex) setup

If you don't already have a working setup of eMoflon it is recommended to start with a fresh and clean install of eclipse as provided by the [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/release/2020-12/r/eclipse-modeling-tools).

## Setup instructions
* Install eMoflon::IBeX as given [here](https://github.com/eMoflon/emoflon-ibex) and follow the "How to Develop" or "How to Install" instructions based on what you want to do.
* In the workspace containing eMoflon, check out: https://github.com/tobnie/MofGen (Branch: master) and import all projects.
* Get rid of all errors:
   * Set your text file encoding to `UTF-8` in `Window->Preferences->General->Workspace`
   * Open `org.moflon.mofgen.lang -> src -> org.moflon.mofgen.lang -> GenerateMofgenLanguage.mwe2` right-click and choose `Run As -> MWE2 Workflow`
   * Eventually rebuild
   * Make sure you have JDK 8 or above.

You are now able to start a dynamic workspace by right-clicking on `org.moflon.mofgen.lang` and running it as an eclipse application.

### Getting Started
To create your own models using *MofGen*, follow these steps:
* Open a dynamic workspace by right-clicking on `org.moflon.mofgen.lang` and running it as an eclipse application.
* In this dynamic workspace, create a new project via `File -> New -> Java Project`
* Create a new `.mofgen`-file in the src-folder and specify your model in there
* You may have to build the project normally again and refresh (F5) for all errors to disappear (`Project -> Build Project`)
* You can now create any source files in the src-folder to generate models!

For every pattern and generator defined in the mofgen-file own classes will be generated as API in the `src-gen` folder.
You have now several ways to available to access the API and start the generation of your specified models:
* run the generated App-Class in `src-gen -> <project_name>.api`. All generators will be run and the created models will be saved in a `generatedModels`-folder within the project itself (if no other folder is specified in the config block of the mofgen-file
* get your models programmatically as EObjects by creating instances of the corresponding Generator Classes in `src-gen -> <project_name>.api.generators` and calling the *start()*-method
* save your models programmatically by creating instances of the corresponding Generator Classes in `src-gen -> <project_name>.api.generators` and calling the *startAndSave()*-method while passing the desired location and name of the generated model file as parameters

There is no exemplary running example yet, but if you want to see the MofgenLanguage in action, feel free to take a look at the mofgen-files in the [test repository](https://github.com/tobnie/MofGen-tests).

Any files with the `.mofgen`-extension should be recognized as such by Xtext. Please be aware that maybe not all invalid language components or expressions throw an error or warning message yet. If you encounter any of these, feel free to communicate them via the 'Issues'-section.
