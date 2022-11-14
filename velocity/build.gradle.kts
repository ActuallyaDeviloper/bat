dependencies {
    compileOnly(libs.velocity.api)
    annotationProcessor(libs.velocity.api)

    compileOnly(libs.luckperms)
	compileOnly(files("../VelocityVanish.v3.8.0.jar"))

    implementation(libs.cloud.velocity)
    implementation(libs.cloud.annotations)
    implementation(libs.configurate.hocon)
}

tasks {
    build {
        dependsOn(named("shadowJar"))
    }

    compileJava {
        sourceCompatibility = "16"
        targetCompatibility = "16"
    }

    shadowJar {
        archiveClassifier.set(null as String?)
        archiveFileName.set(project.name + ".jar")
        destinationDirectory.set(rootProject.tasks.shadowJar.get().destinationDirectory.get())
    }
}
