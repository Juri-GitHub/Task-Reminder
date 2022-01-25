package com.example.taskreminder.ui.todo_list

import com.example.taskreminder.data.Todo

sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todo: Todo): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnAddTodoClick(val todo: Todo): TodoListEvent()
    object OnAddEditTodoClick: TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
}