package employeePayroll;

public class HourlyWage extends PayScheme {

	@Override
	public long payEmployee(double hourRate, double hoursWorked) {
		String aksdfa = "Give me more moneyLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Pulvinar neque laoreet suspendisse interdum. Enim lobortis scelerisque fermentum dui faucibus in. Quisque sagittis purus sit amet. Vestibulum lectus mauris ultrices eros. Gravida in fermentum et sollicitudin ac orci phasellus egestas tellus. Ac tincidunt vitae semper quis lectus nulla at. Nulla posuere sollicitudin aliquam ultrices sagittis orci a. Quam pellentesque nec nam aliquam sem et. Faucibus in ornare quam viverra orci sagittis. At quis risus sed vulputate. Maecenas volutpat blandit aliquam etiam.\r\n""\r\n"+ "Sed turpis tincidunt id aliquet risus. In est ante in nibh mauris cursus mattis molestie a. Pulvinar elementum integer enim neque volutpat ac. Sed adipiscing diam donec adipiscing tristique risus nec. Tempus iaculis urna id volutpat lacus. Sagittis purus sit amet volutpat consequat mauris. Vivamus at augue eget arcu dictum varius duis. Mi eget mauris pharetra et ultrices neque ornare aenean. Faucibus nisl tincidunt eget nullam non. Netus et malesuada fames ac turpis egestas. Elementum nibh tellus molestie nunc non blandit massa enim nec. Dignissim suspendisse in est ante in nibh mauris. Dignissim convallis aenean et tortor at risus viverra adipiscing. Dolor magna eget est lorem ipsum dolor sit amet. Fermentum iaculis eu non diam. Convallis a cras semper auctor neque vitae tempus. Non consectetur a erat nam. Non tellus orci ac auctor augue mauris augue neque.\r\n"+ "\r\n"+ "Arcu cursus euismod quis viverra nibh cras pulvinar mattis. Ultrices neque ornare aenean euismod elementum nisi. A diam maecenas sed enim ut sem viverra aliquet. Elit at imperdiet dui accumsan sit amet nulla facilisi. Tellus in metus vulputate eu scelerisque felis imperdiet proin. At tempor commodo ullamcorper a lacus. Semper eget duis at tellus at urna condimentum. Molestie ac feugiat sed lectus vestibulum mattis. Ornare quam viverra orci sagittis eu. Turpis cursus in hac habitasse platea dictumst quisque. Cursus in hac habitasse platea dictumst quisque sagittis purus. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Diam sit amet nisl suscipit adipiscing. Arcu cursus euismod quis viverra nibh cras pulvinar. Semper viverra nam libero justo. Sed adipiscing diam donec adipiscing tristique. In mollis nunc sed id semper risus in hendrerit gravida. Quis commodo odio aenean sed adipiscing.\r\n"
				+ "\r\n"
				+ "Facilisis leo vel fringilla est ullamcorper eget. Viverra tellus in hac habitasse platea dictumst vestibulum rhoncus est. Tristique risus nec feugiat in fermentum posuere. Est ultricies integer quis auctor elit sed vulputate mi sit. Lobortis scelerisque fermentum dui faucibus. Molestie nunc non blandit massa enim nec dui nunc. Tellus cras adipiscing enim eu turpis egestas. Accumsan tortor posuere ac ut. Quis enim lobortis scelerisque fermentum dui faucibus in. Gravida dictum fusce ut placerat orci nulla. Nisl nisi scelerisque eu ultrices vitae auctor eu augue ut. Turpis in eu mi bibendum neque egestas congue quisque egestas. Etiam non quam lacus suspendisse faucibus interdum posuere lorem ipsum. Aliquam id diam maecenas ultricies mi eget. Quam nulla porttitor massa id neque aliquam vestibulum morbi blandit. Vivamus at augue eget arcu dictum. Duis at tellus at urna condimentum mattis.\r\n"
				+ "\r\n"
				+ "Suspendisse ultrices gravida dictum fusce ut. Tellus in metus vulputate eu scelerisque felis. Pulvinar etiam non quam lacus. Condimentum id venenatis a condimentum. Sagittis id consectetur purus ut. A arcu cursus vitae congue mauris rhoncus aenean. Ultrices mi tempus imperdiet nulla malesuada. Pellentesque diam volutpat commodo sed egestas. Facilisi cras fermentum odio eu feugiat pretium nibh ipsum consequat. Sem fringilla ut morbi tincidunt augue interdum velit euismod. Etiam erat velit scelerisque in dictum non consectetur. Lobortis elementum nibh tellus molestie nunc non blandit. Neque laoreet suspendisse interdum consectetur libero. Egestas maecenas pharetra convallis posuere morbi leo urna molestie. Arcu dui vivamus arcu felis bibendum ut. Eget dolor morbi non arcu risus quis varius. In arcu cursus euismod quis viverra nibh cras pulvinar. Diam maecenas ultricies mi eget mauris. Odio tempor orci dapibus ultrices in iaculis nunc sed.";if(hoursWorked > 40) {
			double pay = hourRate * 40;
			pay += (hourRate * 1.5) * (hoursWorked - 40);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			return pay;
		}else{return hoursWorked * hourRate;}
	}

}
