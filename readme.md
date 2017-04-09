# Osgi Platform

Basic Osgi Platform

## Getting Started

1. Checkout the project.
2. gradlew clean createOsgi -> this will create a run.sh and run.bat
3. gradlew test -> executing tests
4. Adding a bundle is easy. Add your jaava code in bundles/[name.of.your.module]. Modify setting.gradle.
	include(':bundles:[name-of-your-module]')
	project(':bundles:[name-of-your-module]').projectDir = new File(bundlesDir, '[name.of.your.module]')
**Note where dash(-) is used and where dot(.) is used. **
5.Adding a test is simply adding a folder ending with ('-test') under 'tests' folder.

### Prerequisites

1. Git
2. Java

## Deployment

Add additional notes about how to deploy this on a live system

## Built With
* Gradle using Maven Repo

## Authors

* **Mladen Kralev** - *Initial work* - [MladenKralev](https://github.com/mladenkralev)

## Acknowledgments

* https://github.com/renatoathaydes/osgi-run

