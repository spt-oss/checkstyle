# Checkstyle

[![circleci](https://img.shields.io/badge/circleci-checkstyle-brightgreen.svg)](https://circleci.com/gh/spt-oss/checkstyle)
[![maven central](https://img.shields.io/badge/maven_central-checkstyle-blue.svg)](https://mvnrepository.com/artifact/com.github.spt-oss/checkstyle)

* Checkstyle configuration for SPT Java style

## Usage

### IDE

* Checkout the repository and import configuration into your IDE.

	```bash
	checkstyle/src/main/resources/checkstyle/checks.xml
	```

### Maven

* Add a dependency in your POM.

	```xml
	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-checkstyle-plugin</artifactId>
		<configuration>
			<configLocation>checkstyle/checks.xml</configLocation>
		</configuration>
		<dependencies>
			<dependency>
				<groupId>com.puppycrawl.tools</groupId>
				<artifactId>checkstyle</artifactId>
				<version>8.15</version>
			</dependency>
			<dependency>
				<groupId>com.github.spt-oss</groupId>
				<artifactId>checkstyle</artifactId>
				<version>8.15.0</version>
			</dependency>
		</dependencies>
	</plugin>
	```

## License

* This software is released under the Apache License 2.0.
