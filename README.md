This is a robust and scalable hybrid automation framework built using Selenium WebDriver and Java, following the Page Object Model (POM) design pattern. It is designed to be reusable, maintainable, and easily extendable for cross-browser web automation.

The framework integrates industry-standard tools like TestNG, ExtentReports, custom logging, and listeners to enable powerful reporting, debugging, and automation control.

🔧 Key Features
✅ Page Object Model (POM) implemented for clean code structure

🧪 TestNG for test execution, grouping, and parallel runs

📸 Automatic screenshot capture on test failure

📊 ExtentReports for rich and interactive test reporting

📘 Custom logging with timestamps using Log4j/Java Logger

🧩 TestNG Listeners to hook into test lifecycle events

🌍 Cross-browser support (Chrome, Firefox, Edge, etc.)

⚙️ Configurable setup using config.properties

📁 Utility classes for actions like waits, dropdowns, window handling, screenshots, and more

💡 Technologies Used
Java

Selenium WebDriver

TestNG

ExtentReports

Log4j / Java Util Logger

Maven for dependency management

Apache POI (optional, for data-driven testing)

📂 Framework Structure
java
Copy
Edit
project-root/
├── src/main/java
│   ├── base/           → Base classes (e.g., BaseTest, DriverFactory)
│   ├── pages/          → Page classes (POM)
│   ├── utils/          → Utility methods (waits, screenshots, etc.)
│   ├── listeners/      → TestNG listeners (reporting, logging)
│   └── config/         → Configuration handling
├── src/test/java
│   ├── tests/          → Test classes
├── test-output/        → Extent report output
├── config.properties   → Test config (browser, URL, etc.)
├── pom.xml             → Maven dependencies



                                                                               Created By
                                                                               Swaraj Dipak Chaudhari
                                                                               Software Tester (manual+automation+Appium)
