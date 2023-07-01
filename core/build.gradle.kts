plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    sourceSets {
        getByName("main") {
            java.srcDirs("src/main")
            resources.srcDirs("src/main")

        }
        getByName("test") {
            java.srcDirs("src/tests")
        }
    }
}

tasks.named<Test>("test") {
    useJUnit()
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.12")
    implementation("org.hamcrest:hamcrest-core:1.3")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
}
