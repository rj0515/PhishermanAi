# PhishermanAI

**Advanced AI-Powered Phishing Email Detection System**

PhishermanAI is an intelligent desktop application that leverages machine learning and natural language processing to detect phishing emails in real time. The system provides confidence-based threat assessments with detailed analysis, enabling users to identify suspicious emails before they pose a security risk.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Architecture](#architecture)
- [Installation](#installation)
- [Usage](#usage)

## Overview

PhishermanAI combines a modern JavaFX desktop interface with a Python-based machine learning engine to deliver accurate phishing detection. The application analyzes email content using NLP techniques and trained classification models to provide immediate threat assessments with explainable results.

## Features

- **Real-Time Detection**: Analyze emails instantly with ML-based classification
- **Confidence Scoring**: Receive probability-based threat assessments
- **Suspicious Phrase Detection**: Identify common phishing indicators
- **Scan History**: Track analyzed emails in a local SQLite database
- **Desktop Dashboard**: Intuitive JavaFX user interface
- **Seamless Integration**: JSON-based Java-Python communication

## Technology Stack

| Component | Technologies |
|-----------|---------------|
| **Frontend** | JavaFX |
| **Backend** | Python, scikit-learn, pandas, NLTK |
| **Data Storage** | SQLite |
| **Serialization** | Gson, JSON |

## Architecture

```
┌─────────────────────┐
│  JavaFX Frontend    │
└──────────┬──────────┘
           │ JSON Communication
┌──────────▼──────────┐
│  Python ML Engine   │
└──────────┬──────────┘
           │
┌──────────▼──────────┐
│ Trained ML Model    │
└──────────┬──────────┘
           │
┌──────────▼──────────┐
│   Threat Results    │
└─────────────────────┘
```

## Installation

### Backend Setup

```bash
# Install required Python packages
pip install pandas scikit-learn nltk

# Train the machine learning model
python3 train.py

# Start the detection engine
python3 detect.py
```

### Frontend Setup

```bash
# Build and run the JavaFX application
mvn javafx:run
```

## Usage

1. Launch the application using `mvn javafx:run`
2. Input or import an email for analysis
3. View real-time threat assessment and confidence score
4. Review detailed analysis of detected phishing indicators
5. Access scan history from the database
