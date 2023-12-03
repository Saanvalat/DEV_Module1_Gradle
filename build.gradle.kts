plugins {
    kotlin("jvm") version "1.5.31"
    application
}

application {
    mainClass.set("org.example.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
    implementation("com.google.code.gson:gson:2.10.1")
}
