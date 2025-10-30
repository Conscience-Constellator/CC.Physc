package CC.Encycloped.Abs.Scal.Physc.Forc;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.List.Ara_Util;
import CC.Util.Conect.Nod.Tre_Nod;

public class Mag_Com extends Forc_Com
{
	public static final Clas_Rap Class=Init_StRt(Mag_Com.class
		,Clas_Rap.class
	);/*Dep !done*/

	public Mag_Com(){}

	private Mag_Com StM;

	private Mag_Com[] Branchg;
		public void Ad_Branch(Tre_Nod Branch){Branchg=Ara_Util.Ad(Branchg,(Mag_Com)Branch);}
		public void Rem_Branch(Tre_Nod Branch){Branchg=Ara_Util.Ad(Branchg,(Mag_Com)Branch);}

	@Override
	public String Get_Phys_Nam(){return "Mag";}

	static{Init_Nd(Mag_Com.class);}
}