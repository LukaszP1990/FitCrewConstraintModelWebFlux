package com.fitcrew.FitCrewAppConstant.message.type;

public enum ErrorType {

	NO_CLIENT_BOUGHT_TRAINING("No client bought training"),
	NO_CLIENT_FOUND("No client found"),
	NO_CLIENT_DELETED("No client deleted"),
	NO_CLIENT_UPDATED("No client updated"),
	NO_TRAINER_FOUND("No trainer found"),
	RATING_ERROR("Rating failed. Something goes wrong"),
	NO_AVG_RATING("No average rating"),
	NO_TRAINERS_SORTED("No trainers sorted"),
	NO_EMAIL_SENT("Email sending failed"),
	NO_CLIENT_SAVED("Client save failed"),
	LOGIN_ERROR("Login failed"),
	NO_TRAINER_DELETED("No trainer deleted"),
	NO_TRAINER_UPDATED("No trainer updated"),
	NO_TRAINERS("No trainers found"),
	NO_TRAININGS("No trainings found"),
	NO_TRAINER_SAVED("Trainer save failed"),
	NO_TRAINING_SELECTED("No trainings selected"),
	NO_TRAINING_UPDATED("No training updated"),
	NO_TRAINING_DELETED("No training deleted"),
	NO_TRAINING_CREATED("No training created"),
	NO_ADMIN_FOUND("No admin found"),
	NO_ADMIN_SAVED("Admin save failed"),
	NO_CLIENTS_FOUND("No clients found"),
	NO_TRAINER_BY_TRAINER_ID("No trainer found by trainer id"),
	NO_CLIENT_BY_TRAINER_ID("No client found by trainer id"),
	NO_ADMIN_BY_TRAINER_ID("No admin found by trainer id");

	private final String text;

	ErrorType(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}
