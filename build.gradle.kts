repositories {
    jcenter()
}

group = "app.burtan"
val objectboxVersion = "2.5.1"

plugins {
    application
    kotlin("jvm") version "1.3.71"
    id("io.objectbox") version "2.5.1"
}


application {
    mainClassName = "app.burtan.kotlingradlejpms.HelloWorld"
}

java {
    modularClasspathHandling.inferModulePath.set(true)
}

dependencies {
    implementation("io.objectbox", "objectbox-kotlin" , objectboxVersion)

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