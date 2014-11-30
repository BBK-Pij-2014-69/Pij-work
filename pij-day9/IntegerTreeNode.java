public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

	public IntegerTreeNode(int value){
		this.value = value;
	}

	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}

	public int getMax(){
		return right == null ? this.value : right.getMax();
	}

	public int getMin(){
		return left == null ? this.value : left.getMin();
	}

	@Override
	public String toString(){
		return "[" + this.value + " L" + (this.left == null ? "[]" : this.left) + " R" + (this.right == null ? "[]" : this.right)  + "]";
	}

	public String toSimpleString(){
		return "[" + this.value + (this.left == null ? "" : this.left.toSimpleString()) + (this.right == null ? "" : this.right.toSimpleString())  + "]";
	}

	public int depth(){
		int a = this.left == null ? 0 : 1 + this.left.depth();
		int b = this.right == null ? 0 : 1 + this.right.depth();
		return a > b ? a : b;	
	}
	
	public boolean remove(int num){
		if (this.left == null && this.right == null){
			return false;
		}else if(num == this.left.value){
			if (this.left.left == null && this.left.right == null){
				this.left = null;
				return true;
			}else if(this.left.left != null){
				this.left = this.left.left;
				return true;
			}else if(this.left.right != null){
				this.left = this.left.right;
				return true;
			}else{
				this.left.value = this.left.getMax();
				this.left.remove(this.left.getMax());
				return true;
			}
		}else if(num == this.right.value){
			if (this.right.left == null && this.right.right == null){
				this.right = null;
				return true;
			}else if(this.right.left != null){
				this.right = this.right.left;
				return true;
			}else if(this.right.right != null){
				this.right = this.right.right;
				return true;
			}else{
				this.right.value = this.right.getMin();
				this.right.remove(this.right.getMin());
				return true;
			}
		}else if(num < this.value){
			return this.left.remove(num);
		}else{
			return this.right.remove(num);
		}
	}
}