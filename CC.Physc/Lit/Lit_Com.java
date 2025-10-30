package CC.Encycloped.Abs.Scal.Physc.Lit;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Scal.Physc.Phys_Com;
import CC.Util.Conect.Nod.Tre_Nod;
import java.util.ArrayList;

public class Lit_Com extends Phys_Com
{
	public static final Clas_Rap Class=Init_StRt(Lit_Com.class
		,Clas_Rap.class
	);/*Dep !done*/

	public Lit_Com(Lit_Com StM){}
	public Lit_Com(){}

	public ArrayList<Lit_Com> Branch_List=new ArrayList<>();

	public void Ad_Branch(Tre_Nod Branch){}
	public void Rem_Branch(Tre_Nod Branch){}

	@Override
	public String Get_Phys_Nam(){return "Lit";}

	static{Init_Nd(Lit_Com.class);}
}