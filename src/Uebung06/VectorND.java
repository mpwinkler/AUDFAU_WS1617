public class VectorND {

	// DIESE VARIABLE NICHT VERAENDERN
	public double[] data;

	public VectorND (int dim) {
		//TODO
	}

	public int getDimension() {
		//TODO
		return 0;
	}

	public VectorND (double[] initData) {
		//TODO
	}

	public void init(double[] initData) {
		//TODO
	}

	public void multiply (double m) {
		//TODO
	}

	public double dot (VectorND vec) {
		//TODO
		return 0;
	}

	public void add (VectorND vec) {
		//TODO
	}

	public double norm() {
		//TODO
		return 0;
	}

	public void normalize() {
		//TODO
	}

	//DIESE METHODE BITTE NICHT VERAENDERN
	public double getValueAt(int i)
	{
		return data[i];
	}


	//DIESE METHODE BITTE NICHT VERAENDERN
	public static void print(VectorND vec)
	{
		System.out.print("VectorND with " + vec.getDimension() +  " dimensions: ( ");
		for (int i=0;i<vec.getDimension();++i)
		{
			if (i!=0) System.out.print(" , ");
			System.out.format("%.3f", vec.getValueAt(i));
		}
		System.out.println(")");
	}

	//DIESE METHODE BITTE NICHT VERAENDERN
	public static void main(String[] args)
	{
		System.out.println("\n# Vectors\n-------------------------------------");
		VectorND v1 = new VectorND(2);
		double[] data = new double[] {1.0, 2.0};
		v1.init( data );
		print(v1);

		VectorND v2 = new VectorND(new double[]{ 3.0, 3.0, 3.0} );
		print(v2);

		System.out.println("Multiply v1 by 3.");
		v1.multiply(3);
		print(v1);

		VectorND v3 = new VectorND(new double[]{4.0, 8.0});
		print(v3);

		System.out.println("Scalar product between v1 and v2: " + v1.dot(v2));
		System.out.println("Scalar product between v1 and v3: " + v1.dot(v3));
		System.out.println("Scalar product between v3 and v1: " + v3.dot(v1));


		System.out.println("Normalize v2.");
		v2.normalize();
		print(v2);

		System.out.println();
		System.out.println("-------------------------------------\n# Finished Vectors\n");
	}

}



