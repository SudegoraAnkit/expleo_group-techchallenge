# expleo_group-techchallenge — Standalone Eclipse RCP Application

This project packages the DSL editor as a portable, standalone desktop application using Eclipse RCP technology. No Eclipse installation or external Java is required.

## Prerequisites

- Eclipse IDE for RCP and RAP Developers (for building)
- Java 17 (for building, not required for end users if you bundle the JRE)

## Building the Standalone Application

1. **Import the project into Eclipse.**

2. **Create or open the Product Configuration (.product) file** in your main plugin project.

3. **Add all required plugins** (including your DSL and RCP plugins).

4. **Export the application:**
    - Open the `.product` file.
    - Go to the Overview tab.
    - Click “Eclipse Product export wizard”.
    - Select your OS (Windows), architecture (x86_64), and output location.
    - (Optional) Enable “Bundled JRE” for a portable, no-Java-needed app.

5. The output is a folder containing `YourApp.exe` and all dependencies. Zip this folder to distribute.

## Running the Application

- Unzip the folder and double-click `YourApp.exe` (Windows).
- No installation or Java setup required.

## Notes

- To change icons, splash screen, or branding, update the product configuration accordingly.
- The app is portable: it runs from any folder and does not alter the system.

## License

[Specify your license here]
