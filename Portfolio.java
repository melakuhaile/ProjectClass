import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects = new ArrayList<Project>();

     // setter for projects to have access to the priavte arraylist in the Portfolio projects
     public void addToPortfolio(Project proj){
        projects.add(proj);
    }

    // getter
    public ArrayList<Project> getPortfolio(){
        return projects;
    }


    // constructors
    public Portfolio(){
    }

    public Portfolio(Project proj){
        addToPortfolio(proj);
    }
  // return the portfolio cost
    public double getPortfolioCost(){
        double totalCost = 0.0; // initialize total cost
        for (Project project: projects){
            totalCost += project.getInitialCost();
        }
        return totalCost;
    }

    public void showPortfolio(){
        double totalCost = getPortfolioCost();
        for (Project project: projects){
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Total Cost: " + totalCost);
    }


}