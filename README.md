# TK_PAY (TK Wallet with TK-PARA & TK-PUAN)

**A comprehensive Java-based digital wallet application with REST API integration**

## 📖 Overview

TK_PAY is a modern digital wallet solution that combines traditional payment functionalities with a social wallet experience. The application supports multiple currency types (TK-PARA and TK-PUAN) and provides a comprehensive suite of financial services through a robust REST API architecture.

## ✨ Key Features

### 💰 Core Wallet Functions
- **Balance Management**: Real-time balance tracking for TK-PARA and TK-PUAN
- **Top-up Services**: Multiple payment methods for account funding
- **Peer-to-Peer Transfers**: Seamless money transfers between users
- **Bill Payment Integration**: Pay utilities and services directly from wallet
- **Transaction History**: Comprehensive transaction logging and history

### 🌐 Technical Features
- **REST API Architecture**: Full API support for mobile and web integration
- **Secure Authentication**: Multi-layer security implementation
- **Real-time Processing**: Instant transaction processing
- **Database Integration**: Persistent data storage with transaction integrity
- **Error Handling**: Comprehensive error management and logging

### 👥 Social Wallet Features
- **Social Connections**: Connect and transact with friends
- **Group Payments**: Split bills and group transactions
- **Payment Requests**: Send and receive payment requests
- **Activity Feed**: Track social payment activities

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6+
- MySQL/PostgreSQL database
- Git

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Kurtburakk/TK_Pay.git
   cd TK_Pay
   ```

2. **Build the project**
   ```bash
   make
   ```

3. **Run the application**
   ```bash
   make run
   ```

4. **Access the application**
   - The application will start and display a menu interface
   - Follow the on-screen prompts to navigate through different options
   - API endpoints will be available at `http://localhost:8080/api`

## 📱 Usage

### Command Line Interface
After running `make run`, you'll see a menu with various options:
- Account management
- Balance operations
- Transfer functions
- Bill payment services
- Transaction history
- Settings and configuration


## 🏗️ Project Structure

```
TK_Pay/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/tkpay/
│   │   │       ├── controller/     # REST Controllers
│   │   │       ├── service/        # Business Logic
│   │   │       ├── model/          # Data Models
│   │   │       ├── repository/     # Data Access Layer
│   │   │       └── config/         # Configuration
│   │   └── resources/
│   │       ├── application.yml     # App Configuration
│   │       └── static/             # Static Resources
│   └── test/                       # Unit Tests
├── Makefile                        # Build Commands
├── pom.xml                         # Maven Dependencies
└── README.md                       # This File
```

## 📊 Currency System

### TK-PARA
- Primary currency for real money transactions
- Used for bill payments and cash transfers
- Decimal precision support

### TK-PUAN
- Loyalty points system
- Earned through transactions and activities
- Can be used for discounts and special offers


## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 👨‍💻 Developer

**Kurtburakk**
- GitHub: [@Kurtburakk](https://github.com/Kurtburakk)
- Project: [TK_Pay](https://github.com/Kurtburakk/TK_Pay)


## 🏆 Acknowledgments

- Team 14 - TK Wallet Social Wallet Revolution
- Special thanks to all contributors
- Inspired by modern fintech solutions

---

⭐ **Star this repository if you find it helpful!**
