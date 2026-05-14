# PhishermanAi

PhishermanAi is a JavaFX desktop application starter built for macOS using Java 17 and Maven. It includes a clean frontend folder for the JavaFX application, a backend folder for Python ML scripts, and dedicated spaces for data and documentation.

## Project layout

- `frontend/` - JavaFX application code and Maven configuration
- `backend/` - Python machine learning scripts and dependencies
- `data/` - datasets, feature data, and sample files
- `docs/` - architecture notes, guides, and project documentation

## Getting started

1. Install Java 17 and Maven on macOS.
2. Open the `PhishermanAi` folder in VS Code.
3. Build the frontend:
   ```bash
   mvn -f frontend/pom.xml clean package
   ```
4. Run the frontend:
   ```bash
   mvn -f frontend/pom.xml javafx:run
   ```

## Notes

- The frontend uses JavaFX with a dark modern UI.
- The backend includes a starter Python script for future ML and analysis work.
- Use the `.vscode` configuration to run and build directly from VS Code.
