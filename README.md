# 📌 Proyecto de Automatización con Serenity BDD + Screenplay + Cucumber

## 📝 Descripción
Este es un proyecto de **automatización de pruebas** basado en **Serenity BDD** con el **patrón Screenplay**, utilizando **Java 17, Gradle 7.4.2 y Cucumber con Gherkin**.  
Permite la ejecución de pruebas automatizadas de manera estructurada y modular, garantizando mantenibilidad y escalabilidad.

---

## 📦 📌 **Tecnologías Utilizadas**
- 🖥️ **Lenguaje**: Java 17
- 🛠️ **Framework de Automatización**: Serenity BDD + Screenplay
- 📜 **Lenguaje de Pruebas**: Gherkin (Cucumber)
- 📦 **Gestor de Dependencias**: Gradle 7.4.2
- 🌐 **Navegador soportado**: Chrome (configurable en `serenity.conf`)

---

## 🏗️ **Estructura del Proyecto**
📂 src ├── 📂 main │ ├── 📂 java │ │ ├── 📂 models # Modelos de datos │ │ ├── 📂 tasks # Acciones (Tareas de Screenplay) │ │ ├── 📂 interactions # Interacciones con la UI │ │ ├── 📂 questions # Validaciones y consultas │ │ ├── 📂 ui # Mapeo de elementos UI │ │ ├── 📂 utils # Métodos utilitarios │ ├── 📂 test │ ├── 📂 java │ │ ├── 📂 runners # Configuración de ejecución (Cucumber) │ │ ├── 📂 stepdefinitions # Definiciones de pasos │ │ ├── 📂 hooks # Configuración antes/después de las pruebas │ │
│ ├── 📂 resources │ │ ├── 📂 features # Archivos .feature de Gherkin │ │ ├── serenity.conf # Configuración de Serenity BDD │ ├── 📂 target # Carpeta de reportes generados ├── build.gradle # Configuración de dependencias Gradle ├── settings.gradle # Configuración del proyecto Gradle ├── README.md # Documentación del proyecto


---

## 🚀 **Configuración Inicial**

### **1️⃣ Requisitos Previos**
Antes de ejecutar el proyecto, asegúrate de tener instalados:
- [✅ Java 17 (JDK)](https://adoptium.net/)
- [✅ Gradle 7.4.2](https://gradle.org/releases/)
- [✅ Google Chrome (última versión)](https://www.google.com/intl/es/chrome/)
- [✅ ChromeDriver compatible](https://sites.google.com/chromium.org/driver/)

### **2️⃣ Clonar el Repositorio**
```sh
git clone https://github.com/acaraballo1201/reto_bold_automation
cd co.com.reto_auto_bold.certificacion
