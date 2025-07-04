package net.springboot.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.springboot.sms.entity.Student;
import net.springboot.sms.repository.StudentRepository;
import net.springboot.sms.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceimpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
