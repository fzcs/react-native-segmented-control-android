
# react-native-segmented-control-android

## Getting started

`$ npm install react-native-segmented-control-android --save`

### Mostly automatic installation

`$ react-native link react-native-segmented-control-android`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-segmented-control-android` and add `RNSegmentedControlAndroid.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNSegmentedControlAndroid.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNSegmentedControlAndroidPackage;` to the imports at the top of the file
  - Add `new RNSegmentedControlAndroidPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-segmented-control-android'
  	project(':react-native-segmented-control-android').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-segmented-control-android/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-segmented-control-android')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNSegmentedControlAndroid.sln` in `node_modules/react-native-segmented-control-android/windows/RNSegmentedControlAndroid.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Segmented.Control.Android.RNSegmentedControlAndroid;` to the usings at the top of the file
  - Add `new RNSegmentedControlAndroidPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNSegmentedControlAndroid from 'react-native-segmented-control-android';

// TODO: What to do with the module?
RNSegmentedControlAndroid;
```
  