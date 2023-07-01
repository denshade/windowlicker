// settings.gradle.kts

// build.gradle.kts
plugins {
    id("java")
}

repositories {
    mavenCentral()
}

subprojects {
    apply<JavaPlugin>()

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    repositories {
        mavenCentral()
    }

}

dependencies {
    implementation(project(":core"))
    implementation(project(":web"))
    implementation(project(":swing"))
}
