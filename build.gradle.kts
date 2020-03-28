plugins {
    application
    kotlin("jvm") version "1.3.71"
}

group = "app.burtan"

repositories {
    mavenCentral()
}

application {
    mainClassName = "app.burtan.kotlingradlejpms.HelloWorld"
}

java {
    modularClasspathHandling.inferModulePath.set(true)
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.71:modular")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.71:modular")

}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}