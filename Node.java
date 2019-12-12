package Tree;
import java.util.ArrayList;

public class Node {
	

	Node parent;
	ArrayList<Node> children;
	int nodeDepth;
	double nodeEvaluation;
	
	Node(Node parent, int nodeDepth, double nodeEvaluation){
		this.parent = parent;
		this.nodeDepth = nodeDepth;
		this.nodeEvaluation = nodeEvaluation;
	}
	
	Node(Node parent,ArrayList<Node> children ,int nodeDepth, double nodeEvaluation){
		this.parent = parent;
		this.nodeDepth = nodeDepth;
		this.children = children;
		this.nodeEvaluation = nodeEvaluation;
	}
	
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public ArrayList<Node> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}
	public int getNodeDepth() {
		return nodeDepth;
	}
	public void setNodeDepth(int nodeDepth) {
		this.nodeDepth = nodeDepth;
	}
	
	
	public double getNodeEvaluation() {
		return nodeEvaluation;
	}
	public void setNodeEvaluation(double nodeEvaluation) {
		this.nodeEvaluation = nodeEvaluation;
	}

}
