# Stellar_View
---

## Scala Stellar View

Scala Stellar View is a Spark/Scala project developed as part of Harvard University’s graduate course *Programming in 
Scala for Big Data Systems*. It simulates real-time streaming of astronomical data to visualize and predict 3D 
trajectories of stellar objects, featuring an ETL pipeline and interactive visualizations.

---

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Installation & Setup](#installation--setup)
- [Usage](#usage)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- **Simulated Real-Time Streaming**: Replays astronomical datasets to mimic real-time data flow.
- **ETL Pipeline**: Processes and transforms raw data for analysis.
- **3D Visualization**: Interactive plots depicting stellar trajectories.
- **Predictive Modeling**: Forecasts future positions of stellar objects using time-series analysis.

---

## Project Structure

```

Scala\_Stellar\_View/
├── finalprojectscala/
│   ├── build.sbt
│   ├── src/
│   ├── data/
│   ├── simulate\_stream.sh
│   ├── .gitignore
│   └── ...
├── docs/
│   ├── annotated-Milestone1.pdf
│   ├── annotated-Milestone2.pdf
│   └── final-project-proposal.pdf
├── visuals/
│   ├── 3D\_Trajectories.png
│   └── Future\_Predictions.png
└── README.md

````

---

## Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/bilaljarwan-dev/Scala_Stellar_View.git
cd Scala_Stellar_View/finalprojectscala
````

### 2. Set Up the Environment

Make sure the following prerequisites are installed:

* Java Development Kit (JDK) version 8 or newer
* Scala
* Apache Spark

Verify installations by running:

```bash
java -version
scala -version
spark-shell --version
```

Install project dependencies using sbt:

```bash
sbt update
```

### 3. Run the Simulation

Execute the streaming simulation script:

```bash
./simulate_stream.sh
```

> **Note:** Ensure the script has execute permissions. If it doesn’t, run:

```bash
chmod +x simulate_stream.sh
```

---

## Usage

* **Data Input**: Place your astronomical dataset in the `data/` directory.
* **Running the Application**:
  Run the application using:

```bash
sbt run
```

Follow the on-screen prompts to initiate data processing and visualization.

* **Visualization**: Generated plots will be saved in the `visuals/` directory.

---

## Documentation

Detailed documentation and project milestones can be found in the `docs/` directory:

* [Final Project Proposal](docs/final-project-proposal.pdf)
* [Milestone 1](docs/annotated-Milestone1.pdf)
* [Milestone 2](docs/annotated-Milestone2.pdf)

---

## Contributing

Contributions are warmly welcomed! Feel free to fork the repository and submit a pull request with enhancements or bug fixes.

This project was ambitious and definitely stretched my limits with Scala. You're encouraged to add your touch—just don't forget to share your improvements with me! The project is roughly **95% complete**, as I expanded beyond the original course requirements and haven't yet finalized all features.

---

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
