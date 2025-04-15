# 📱 FromUtoU

**From You To You** is a mini service-sharing application that connects two types of users:

- 💼 **Providers** – who offer services.
- 🔍 **Askers** – who browse and benefit from services.

This simple app builds a smooth bridge between those who want to **offer** and those who want to **ask**.

---

## ✨ Features

### 👤 For Providers
Providers can:
- Add new services by filling a 3-step form that includes:
  - 📝 **Basic Info**: Name, classification, price, description.
  - 📞 **Contact Info**: WhatsApp, Email, Instagram, Twitter.
  - 🖼️ **Media & Payment**: Upload photos/videos, select payment methods (Free, Mada card, Visa, Cash).
- View all previously added services in a personal dashboard.
- Organize their offerings by category.

### 🔎 For Askers
Askers can:
- Browse available services through categories such as:
  - Java Projects
  - Web Pages
  - PHP Scripts
  - Databases
- View details of each service including:
  - Description
  - Contact options
  - Media
  - Payment method
- Contact the provider directly using the provided links.

---

## 📸 Screenshots

### Welcome Screen

This is the first screen users see when they launch the app. It shows the app's branding and a welcome message to start the experience:

![Provider Services](./screenshots/app_welcome_screen.png)

---

### User Role Selection
After logging in, users choose whether they want to offer services (Provider) or request services (Asker), guiding them to tailored experiences:

![Add Service - Step 3](./screenshots/choose_user_role.png)

---

### Service Categories
Providers can classify their services under different categories like Drawing, Programming, Designing, or Others. Users can also search for specific services using the search bar.:

![Add Service - Step 3](./screenshots/service_categories.png)

---

### Provider Services
This is the provider's main page, showcasing all the services they’ve added:

![Add Service - Step 3](./screenshots/proider_services.png)

---

## 🛠️ Tech Stack

- **Language**: Java  
- **UI Framework**: JavaFX  
- **Design Style**: Clean, scrollable multi-step form  
- **Data Handling**: Locally managed (placeholder for database integration)

---

## 🚀 Future Enhancements

- Implement user authentication (for Askers and Providers)
- Add a search & filter system for services
- Allow Askers to rate or favorite services
- Enable Providers to edit or delete services
- Support for notifications when a service gets interest

---

## 📂 Project Structure

```bash
FromYouToYou/
├── src/
│   ├── Main.java
│   ├── views/
│   │   ├── ProviderDashboard.java
│   │   ├── AddServiceStep1.java
│   │   ├── AddServiceStep2.java
│   │   └── AddServiceStep3.java
│   └── models/
│       └── Service.java
├── assets/
│   └── images/
├── README.md
