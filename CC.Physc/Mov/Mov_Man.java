package CC.Encycloped.Abs.Scal.Physc.Mov;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Abs.Scal.Gom.SpAc_Com;
import CC.Encycloped.Abs.Scal.Gom.Scrut.Bord_.Bordr_Comp;
import CC.Util.Manager;
import CC.List.Ara_List_Plus;

public class Mov_Man extends Manager
{
	public static final Clas_Rap Class=Init_StRt(Mov_Man.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Mov_Man(){}

	public void Mov_Teleport(Ara_List_Plus Coordinate,double[] Movement){}
	public void Mov_Ray_Trac(Ara_List_Plus Coordinate,double[] Movement){}
	public void Mov_Propos(Ara_List_Plus Target,double[] Movement)
	{
		new Bordr_Comp();
		boolean Side=false;
		if(false){}
	}
	public void Rotat_Teleport(Ara_List_Plus Target,double[] Rotation){}
	public void Rotat_Ra_Trac(Ara_List_Plus Target,double[] Rotation){}
	public void Rotat_Propos(Ara_List_Plus Target,double[] Rotation)
	{
		boolean Side=false;
		if(false) {
			this.Rotat_Teleport(Target, Rotation);
		}
	}
	public void Chang_Siz_Teleport(Bordr_Comp Border_Component,double[] Size_Change){}
	public void Chang_Siz_Ra_Trac(Bordr_Comp Border_Component,double[] Size_Change){}
	public void Chang_Siz_Propos(Bordr_Comp Border_Component,double[] Size_Change){}

	public void Spac_Par_Loop(){}

	public Bordr_Comp Path_Calc(SpAc_Com Target)
	{
		Bordr_Comp Path_Bord=null;

		return null;
	}

	public void Gravitate(){}

	static{
		Init_Nd(Mov_Man.class);}
}