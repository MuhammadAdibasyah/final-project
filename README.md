# final-project

# Automated Testing Project

## 📌 Overview
Repository ini berisi automation test untuk Web UI dan API menggunakan Java dengan framework JUnit, Cucumber, dan Selenium.

## 🚀 Tech Stack
- **Bahasa Pemrograman**: Java
- **Framework Testing**: JUnit, Cucumber
- **UI Testing**: Selenium WebDriver
- **API Testing**: RestAssured
- **Dependency Management**: Gradle

## 📂 Project Structure
```
|-- src
|   |-- test
|   |   |-- java
|   |   |   |-- stepdefinitions    # Implementasi step Cucumber
|   |   |   |-- runners            # Runner test Cucumber
|   |   |   |-- pages              # Page Object Model (POM) untuk UI testing
|   |   |   |-- api                # API test cases
|   |   |   |-- features           # File feature Cucumber
|   |   |   |-- helper             # function pendukung
```

## 🔧 Installation & Setup
1. **Clone Repository**
   ```sh
   git clone https://github.com/MuhammadAdibasyah/final-project.git
   ```
2. **Install Dependencies**
   Jika menggunakan Gradle:
   ```sh
   ./gradlew clean build
   ```
   Jika menggunakan Maven:
   ```sh
   mvn clean install
   ```

## 🏃 How to Run Tests
### ✅ Menjalankan UI Tests
```sh
./gradlew cucumber -Ptags="@web"
```
### ✅ Menjalankan API Tests
```sh
./gradlew cucumber -Ptags="@Api"
```

## 📊 Reporting
Setelah menjalankan test, laporan hasil dapat ditemukan di:
```
build/reports/cucumber.html
```

Happy Testing! 🚀

