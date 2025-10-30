package CC.Encycloped.Abs.Scal.Physc.Forc;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.List.Ara_Util;
import CC.Util.Conect.Nod.Tre_Nod;

public class Grav_Com extends Forc_Com
{
	public static final Clas_Rap Class=Init_StRt(Grav_Com.class
		,Clas_Rap.class
	);/*Dep !done*/

	public Grav_Com(){}

	public Grav_Com Stem;

	public Grav_Com[] Branch_List=new Grav_Com[0];
		public void Ad_Branch(Tre_Nod Branch){Branch_List=Ara_Util.Ad(Branch_List,(Grav_Com)Branch);}
		public void Rem_Branch(Tre_Nod Branch){Branch_List=Ara_Util.Ad(Branch_List,(Grav_Com)Branch);}

	@Override
	public String Get_Phys_Nam(){return "Grav";}

	static{Init_Nd(Grav_Com.class);}
}