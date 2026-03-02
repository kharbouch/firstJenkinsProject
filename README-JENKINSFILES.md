# 📋 Guide des Jenkinsfiles

Ce projet contient plusieurs versions de Jenkinsfile pour différents environnements.

## 📁 Fichiers disponibles

### 1. `Jenkinsfile` (Mac/Linux)
- Utilise `sh` pour exécuter les commandes Maven
- Pour systèmes Unix (Mac, Linux)
- **Commandes** : `sh 'mvn ...'`

### 2. `Jenkinsfile.windows`
- Utilise `bat` pour exécuter les commandes Maven
- Pour systèmes Windows
- **Commandes** : `bat 'mvn ...'`

### 3. `Jenkinsfile.universal` (Recommandé)
- Détecte automatiquement l'OS avec `isUnix()`
- Fonctionne sur Windows, Mac et Linux
- **Commandes** : Utilise `sh` ou `bat` selon l'OS

## 🔧 Configuration dans Jenkins

### Option 1 : Utiliser un fichier spécifique

Dans la configuration du pipeline :
- **Script Path** : `Jenkinsfile` (Mac/Linux)
- **Script Path** : `Jenkinsfile.windows` (Windows)
- **Script Path** : `Jenkinsfile.universal` (Tous les OS)

### Option 2 : Renommer le fichier

```bash
# Pour Windows
cp Jenkinsfile.windows Jenkinsfile

# Pour Mac/Linux (déjà par défaut)
# Jenkinsfile est déjà configuré

# Pour universel
cp Jenkinsfile.universal Jenkinsfile
```

## 🎯 Différences principales

| Aspect | Mac/Linux | Windows |
|--------|-----------|---------|
| Commande shell | `sh` | `bat` |
| Séparateur de chemin | `/` | `\` |
| Variables d'env | `$VAR` | `%VAR%` |

## 💡 Recommandation

Utilisez **`Jenkinsfile.universal`** pour un pipeline qui fonctionne partout !

```groovy
script {
    if (isUnix()) {
        sh 'mvn clean compile'
    } else {
        bat 'mvn clean compile'
    }
}
```
