package CC.Encycloped.Abs.Scal.Physc.Atach;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Scal.Gom.SpAc_Com;
import CC.Util.Object_Plus;
import java.util.ArrayList;

public class BoD extends Object_Plus
{
	public static final Clas_Rap Class=Init_StRt(BoD.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public BoD(){}

	boolean Contig;
	boolean Rigid;
	public ArrayList<SpAc_Com> Spac_Com_List;

	public void Contig_Bod()
	{
		//new Body(this);
	}
	public void Rigid_Bod()
	{
		//new Body(this);
	}

	static{Init_Nd(BoD.class);}
}