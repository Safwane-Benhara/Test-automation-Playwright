# 🔧 Automation Framework & E-Commerce Project Overview

## 📌 Project 1: Playwright Automation Framework (Java-based)

This is a UI test automation framework built primarily using **Playwright** and **Java**. It follows good design principles and includes some helpful dependencies like:

- ✅ **Cucumber** – for writing test cases in a **BDD** (Behavior-Driven Development) style
- ✅ **JUnit/TestNG** (if applicable) – for test execution
- ✅ **Maven** – for dependency management

### 🔧 Installation

To set up the project:

1. Install **JDK 17+**.
2. Use an IDE like **IntelliJ IDEA**.
3. Clone the repository and open it in IntelliJ.
4. Run `mvn clean install` to download all dependencies.

> **Note**: If you're using email/password-based scenarios, set up environment variables for these sensitive values. Following good practices, **no credentials are stored in the project or GitHub**.

---

## 📦 Project 2: Node.js E-commerce Web App (Test Target)

This is a separate **Node.js-based e-commerce application** used to test real-world flows. It includes features like:

- 🛒 Product browsing and checkout
- 💳 PayPal payment simulation
- ☁️ Image uploads using Cloudinary

### ⚙️ Setup

1. Clone the project from GitHub.
2. Fix minor configuration issues (e.g., Cloudinary & PayPal).
3. Follow the instructions provided in the repository to run the app.

- Backend: `http://localhost:5000`
- Frontend: `http://localhost:4173`

### 🔐 Admin Setup

- An **admin user** was manually configured to create different products for testing purposes.
- These products are used in **automated tests** written in the Playwright-Java framework.

---

## ✅ Feature Files

In the `/src/test/resources/features` directory, you will find `.feature` files written in **Gherkin syntax**, covering important user flows like:

- User login
- Product search & view
- Add to cart
- Checkout

These BDD test cases ensure key flows are functioning correctly from end to end.

---

## 📌 Notes

- The two projects are **decoupled**: one serves as the automation framework, and the other as the target web app.
- This structure reflects real-world testing environments and is designed for clarity, reusability, and good security practices.

---

Feel free to fork or clone and adapt the code for your own learning or professional test automation work!
