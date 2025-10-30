package CC.Encycloped.Abs.Scal.Physc;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Scal.Gom.SpAc_Com;
import CC.Encycloped.Abs.Scal.Gom.Vectr_Typ_Havr;
import CC.Util.By.Get_Q_By_Q;
import CC.Util.Component;
import CC.Util.Conect.Nod.Tre_Nod;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Util.Onr_Havr;

public abstract class Phys_Com<Vectr_Typ extends Get_Q_By_Q> extends Component implements Onr_Havr,Vectr_Typ_Havr<Vectr_Typ>
{
	public static final Clas_Rap Class=Init_StRt(Phys_Com.class
		,Clas_Rap.class
	);/*Dep !done*/

	public Phys_Com(Phys_Com StM){this.StM=StM;}
	public Phys_Com(){}

	public Phys_Com StM;
		public void Set_StM(Tre_Nod StM){}
		public Phys_Com StM(){return StM;}

	public SpAc_Com Onr;
		@Override public void Set_Onr(Object Onr)
		{
			if(this.Onr!=null){this.Onr.Rem_Phys_Comp(Class);}

			this.Onr=(SpAc_Com)Onr;
		}
		@Override public SpAc_Com Onr(){return Onr;}

	public Object Branchg;

	@Lin_Dclar
	public abstract String Get_Phys_Nam();

	static{Init_Nd(Phys_Com.class);}
}