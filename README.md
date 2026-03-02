# 🚀 First Jenkins Project - Pipeline Java avec Maven

Projet d'exemple Java avec pipeline Jenkins complet pour l'apprentissage CI/CD.

## 📋 Prérequis

- Java 11 ou supérieur
- Maven 3.6+
- Jenkins avec plugins: Maven Integration, JUnit

## 🏃 Exécution locale

### Compiler le projet
```bash
mvn clean compile
```

### Exécuter les tests
```bash
mvn test
```

### Générer le JAR
```bash
mvn package
```

### Exécuter l'application
```bash
java -jar target/first-jenkins-project-1.0-SNAPSHOT.jar
```

## 🔧 Configuration Jenkins

### 1. Configurer les outils globaux
Dans Jenkins > Manage Jenkins > Global Tool Configuration :

- **JDK**: Ajouter JDK 11
- **Maven**: Ajouter Maven 3.8.6

### 2. Créer le pipeline
1. New Item > Pipeline
2. Dans "Pipeline" section:
   - Definition: Pipeline script from SCM
   - SCM: Git
   - Repository URL: [votre-repo-url]
   - Script Path: Jenkinsfile
3. Save & Build

## 📦 Pipeline Jenkins

Le pipeline exécute les étapes suivantes:

1. **🔍 Checkout**: Clone le repository Git
2. **🔧 Build**: Compile le code source avec Maven
3. **🧪 Test**: Exécute les tests unitaires JUnit
4. **📦 Package**: Génère le fichier JAR
5. **📚 Archive**: Archive les artefacts (JAR + POM)

## 📁 Structure du projet

```
firstJenkinsProject/
├── src/
│   ├── main/java/com/example/
│   │   ├── App.java           # Application principale
│   │   └── Calculator.java    # Classe métier
│   └── test/java/com/example/
│       ├── AppTest.java        # Tests App
│       └── CalculatorTest.java # Tests Calculator
├── pom.xml                     # Configuration Maven
├── Jenkinsfile                 # Pipeline Jenkins
└── README.md
```

## ✅ Tests inclus

- Tests unitaires avec JUnit 5
- Couverture des opérations de base (add, subtract, multiply, divide)
- Tests des cas limites (division par zéro, nombres négatifs)

## 🎯 Objectifs pédagogiques

✅ Clone d'un repository Git  
✅ Compilation avec Maven  
✅ Exécution de tests unitaires  
✅ Génération d'un fichier JAR  
✅ Archivage des artefacts
