/*
 * Created by Ubique Innovation AG
 * https://www.ubique.ch
 * Copyright (c) 2020. All rights reserved.
 */

package org.dpppt.android.sdk.internal.backend;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import okhttp3.Response;

public class ResponseException extends Exception {

	private Response response;

	public ResponseException(@NonNull Response response) {
		this.response = response;
	}

	@Nullable
	@Override
	public String getMessage() {
		return "Code: " + response.code() + " Message: " + response.message();
	}
}
