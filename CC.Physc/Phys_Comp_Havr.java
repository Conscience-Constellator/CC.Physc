package CC.Encycloped.Abs.Scal.Physc;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Util.By.Get_Q_By_Q;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.*;

public interface Phys_Comp_Havr<Vectr_Typ extends Get_Q_By_Q> extends
		Ad_Phys_Comp<Vectr_Typ>,
		Get_Phys_Comp<Vectr_Typ>,
		Rem_Phys_Comp<Vectr_Typ>
{
	Clas_Rap Class=Ad_Reg_Task(Phys_Comp_Havr.class
		,Clas_Rap.class
	);
}