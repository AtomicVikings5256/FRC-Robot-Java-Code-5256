package org.usfirst.frc5256.BlueTapeThree1.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5256.BlueTapeThree1.Robot;
import org.usfirst.frc5256.BlueTapeThree1.RobotMap;

public class AutoTurnLeft extends Command{
	public AutoTurnLeft(){
		requires(Robot.drive);
	}
	
	
// Called just before this Command runs the first time
protected void initialize() {
}

// Called repeatedly when this Command is scheduled to run
protected void execute() {
	// 0.8075
	RobotMap.driveWPI_Drive.arcadeDrive(0, .93);
}

// Make this return true when this Command no longer needs to run execute()
protected boolean isFinished() {
    return false;
}

// Called once after isFinished returns true
protected void end() {
	RobotMap.driveWPI_Drive.arcadeDrive(0, 0);
}

// Called when another command which requires one or more of the same
// subsystems is scheduled to run
protected void interrupted() {
	end();
}
}
