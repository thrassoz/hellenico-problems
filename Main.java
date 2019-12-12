package Tree;
import java.util.ArrayList;
public class Main {
	
	

	public static void main(String[] args) {
		ArrayList<Node> tempDepth1 = new ArrayList<Node>();
		ArrayList<Node> tempDepth2 = new ArrayList<Node>();
		ArrayList<Node> children = new ArrayList<Node>();
		Node root = new Node(null, children, 0, 0);
		Node child; 
		ArrayList<Node> childOfChild;
		
		//CREATE LEVEL 1 
		for(int i = 0;i<3;i++) {
			childOfChild = new ArrayList<Node>();
			child = new Node(root, childOfChild, 1, i%3);
			root.children.add(child);
			for(int j = 0;j<8;j++) {
				Node childofChild = new Node(child, 2, j%8);
				child.children.add(childofChild);
			}
		}
		
		tempDepth1 = root.getChildren();
		
		for(int i = 0;i<tempDepth1.size();i++) {
			for(int j=0;j<tempDepth1.get(i).getChildren().size();j++) {
				System.out.print(tempDepth1.get(i).getChildren().get(j).getNodeEvaluation() + " ");
			}
		}
		
		
		
		
	}
}

