This project is for an FRC robot controlled by a custom steering wheel setup, designed and coded in Java. The robot uses a **virtual gearbox** system, operates on a **command-based** structure, and includes an **FPV (First-Person View)** camera for visual feedback. Below, you'll find information about the project structure, dependencies, and how to run and control the robot.

## Table of Contents

- [Project Overview](#project-overview)
- [Key Features](#key-features)
  - [Custom Steering Wheel Control](#custom-steering-wheel-control)
  - [Virtual Gearbox](#virtual-gearbox)
  - [Command-Based Structure](#command-based-structure)
  - [FPV Camera](#fpv-camera)
- [Custom Package for Steering Wheel](#custom-package-for-steering-wheel)
- [Robot Architecture](#robot-architecture)

## Project Overview

The FRC XRP robot is designed to be controlled using a custom steering wheel input device. This robot features a **virtual gearbox**, allowing dynamic control of speed and torque based on real-time input from the steering wheel. The system is built with a **command-based** architecture to provide a clean, modular, and maintainable codebase. Additionally, the robot includes an **FPV camera** to give the operator a first-person view of the robot’s surroundings.

The project is coded in **Java**, following FRC’s standard programming environment, and leverages WPILib for hardware control and inputs.

---

## Key Features

### Custom Steering Wheel Control

The robot is controlled via a custom steering wheel. This input device communicates with the robot to control various aspects such as speed, direction, and specific robot functions. A **custom Java package** is implemented to handle the input processing, which translates steering wheel movements into actionable commands for the robot's drivetrain and other systems.

### Virtual Gearbox

The robot uses a **virtual gearbox** to adjust the drive system's performance dynamically. The virtual gearbox simulates different gearing ratios, adjusting the robot’s speed and torque on-the-fly based on inputs from the steering wheel. This allows for a more flexible and responsive control experience.

### Command-Based Structure

The robot’s software follows a **command-based** architecture, which is a design pattern used by FRC teams to structure their code. In this structure:
- **Commands** represent specific actions the robot can perform.
- **Subsystems** represent hardware components, such as the drivetrain, sensors, and actuators.
- **Robot** class orchestrates the overall operation by scheduling commands and initializing subsystems.

This architecture helps maintain modular, readable, and maintainable code.

### FPV Camera

The robot is equipped with an **FPV camera** to give the operator real-time visual feedback. The camera stream is sent to the operator station, allowing for precise control in scenarios where the robot's physical position and surrounding environment are critical.

---

## Custom Package for Steering Wheel

The custom package for processing the steering wheel input. This package is responsible for capturing inputs from the steering wheel, interpreting them, and sending commands to the robot’s drivetrain.

### Key Components:
- **Shifter:** Sequential shifter that changes a multiplier for overall speed.
- **Throttle/Break:** Custom axis that combines these both as different parts of a single axis from 0-1.
- **Turning:** The way that the rotation of the weel is translated to the axis that the robot takes input from.

You can modify the input mapping to customize the control layout as per your preferences.

---

## Robot Architecture

The robot follows a **command-based architecture** provided by WPILib, allowing for a structured and organized approach to programming. Below are the key elements of the architecture:

- **Commands**: Define actions for the robot. Each action is encapsulated in a command, such as driving forward or controlling the arm.
- **Subsystems**: Represent physical components of the robot, like the drivetrain, arm, or sensors. These subsystems contain the logic for controlling the hardware.
- **Scheduler**: The scheduler manages which commands are active and when they are executed.

The **robot.java** file initializes the robot, creates the necessary subsystems, and schedules commands to run during teleoperated periods.

---

readme made with AI assistance
