package edt.iut.control;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;

public class Constraint {
	public static final int HOURMIN = 8;
	public static final int HOURMAX = 17;
	
	private Solver hourS; // Solveur des heures possibles
	
	public Constraint(){ // On initialise les solvers
		hourS = new Solver("Hour range solver");
	}
	
	public boolean verify(String time){
		IntVar x = VariableFactory.bounded("time",HOURMIN,HOURMAX,hourS);
		return(true);
	}
}
