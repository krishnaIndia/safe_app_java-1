package net.maidsafe.binding;

import net.maidsafe.binding.model.FfiCallback.HandleCallback;
import net.maidsafe.binding.model.FfiCallback.PointerCallback;
import net.maidsafe.binding.model.FfiCallback.ResultCallback;
import net.maidsafe.binding.model.FfiCallback.TwoHandleCallback;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

public interface CryptoBinding extends Library {

	void app_pub_sign_key(Pointer app, Pointer userData, HandleCallback cb);

	void sign_key_free(Pointer app, long handle, Pointer userData,
			ResultCallback cb);

	void sign_key_new(Pointer app, Pointer rawData, Pointer userData,
			HandleCallback cb);

	void sign_key_get(Pointer app, long handle, Pointer userData,
			PointerCallback cb);
	
	void app_pub_enc_key(Pointer app, Pointer userData,
			HandleCallback cb);
	
	void enc_pub_key_new(Pointer app, Pointer rawData, Pointer userData,
			HandleCallback cb);
	
	void enc_generate_key_pair(Pointer app, Pointer userData, TwoHandleCallback cb);
	
	void enc_pub_key_get(Pointer app, long handle, Pointer userData,
			PointerCallback cb);
	
	void enc_secret_key_get(Pointer app, long handle, Pointer userData,
			PointerCallback cb);
	
	void enc_secret_key_new(Pointer app, Pointer rawData, Pointer userData,
			HandleCallback cb);
	
	void enc_pub_key_free(Pointer app, long handle, Pointer userData,
			ResultCallback cb);
	
	void enc_secret_key_free(Pointer app, long handle, Pointer userData,
			ResultCallback cb);
		 
	// void encrypt();
	// void decrypt();
	// void encrypt_sealed_box();
	// void decrypt_sealed_box();
	// void sha3_hash();

}
